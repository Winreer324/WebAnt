//package com.example.practice_webant.adapter;
//
//import android.net.Uri;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//import com.example.practice_webant.R;
//
//public class GalleryAdapter extends BaseAdapter {
//    private ArrayList<String> mData;
//    LayoutInflater inflater;
//
//    public GalleryAdapter(Context context, List<String> items) {
//        mData = (ArrayList<String>) items;
//        inflater = LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return mData.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mData.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public boolean areAllItemsEnabled() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled(int position) {
//        return true;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        final ViewHolder viewHolder;
//        if (convertView == null) {
//            // Если вида нет (не создан) - разжимаем его из лайоута
//            convertView = inflater.inflate(R.layout.item_image_grid, parent, false);
//            viewHolder = new ViewHolder();
//            viewHolder.thumb = (ImageView) convertView.findViewById(R.id.image_thumb);
//            convertView.setTag(viewHolder);
//        } else {
//            // Используем уже готовый и достаем viewHolder чтобы не
//            // делать каждый раз findViewById - это экономит до 30% процессорных циклов
//            viewHolder = (ViewHolder) convertView.getTag();
//        }
//
//        String item = (String) getItem(position);
//        try {
//            uri = Uri.parse(item);
//
//            // Асинхронная загрузка изображений с помощью библиотеки UIL
//            // Перед началом загрузки изображение очищается (ставим
//            // пустую серую рамку или какой-нибуть индикатор) для того чтобы
//            // в процессе загрузки не отображались предыдущие картинки
//            ImageLoader.getInstance().loadImage(uri, new ImageLoadingListener() {
//                @Override
//                public void onLoadingStarted(String imageUri, View view) {
//                    viewHolder.thumb.setImageResource(R.drawable.gallery_empty);
//                }
//
//                @Override
//                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
//                    viewHolder.thumb.setImageBitmap(loadedImage);
//                }
//
//                @Override
//                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
//                    Logger.Warn("Загрузка изображения не удалась (" + failReason.getType().toString() + ")");
//                }
//
//                @Override
//                public void onLoadingCancelled(String imageUri, View view) {
//                    Logger.Warn("Загрузка изображения отменена (canceled)");
//                }
//            });
//        } catch (Exception e) {
//            Logger.Exception(e);
//        }
//
//        return convertView;
//    }
//
//    static class ViewHolder {
//        ImageView thumb;
//    }
//}