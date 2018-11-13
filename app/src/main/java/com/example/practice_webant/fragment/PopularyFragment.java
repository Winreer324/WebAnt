package com.example.practice_webant.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practice_webant.R;
import com.example.practice_webant.adapter.ListAdapter;
import com.example.practice_webant.dto.DTO;

import java.util.ArrayList;
import java.util.List;

public class PopularyFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_populary;

    public static PopularyFragment getInstance(Context context) {
        Bundle args = new Bundle();

        PopularyFragment fragment = new PopularyFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_populary));
        //fragment.setImg(R.drawable.catlove);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recyclerView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new ListAdapter(createMockRemindListData()) );

        return view;
    }
    // пока что заглушка (типа сервера), но это будет возращатся то что приходит с сервера
    private List<DTO> createMockRemindListData() {
        List<DTO> data = new ArrayList<>();
        data.add(new DTO("Test item 1 PopularyFragment","catlove"));
        data.add(new DTO("Test item 2 PopularyFragment","catlove"));
        data.add(new DTO("Test item 3 PopularyFragment","catlove"));
        data.add(new DTO("Test item 4 PopularyFragment","catlove"));
        data.add(new DTO("Test item 5 PopularyFragment","catlove"));
        data.add(new DTO("Test item 6 PopularyFragment","catlove"));
        data.add(new DTO("Test item 7 PopularyFragment","catlove"));
        data.add(new DTO("Test item 8 PopularyFragment","catlove"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
