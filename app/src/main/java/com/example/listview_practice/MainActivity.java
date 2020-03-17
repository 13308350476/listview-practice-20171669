package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String [] names = new String[]{"1","2","3","4"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
    }

private class MyAdapter extends BaseAdapter{

    @Override
    //返回条目数量
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        ViewHolder vh = null;
        if(convertView == null){
            view = getLayoutInflater().inflate(R.layout.list_item,null);
            vh = new ViewHolder();
            //得到文字
            vh.tvText = (TextView)view.findViewById(R.id.tv_list_item);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolder) view.getTag();
        }

        TextView tvText = (TextView)view.findViewById(R.id.tv_list_item);

        tvText.setText(names[position]);
        return view;
    }
}
    class ViewHolder{
        ImageView ivImage;
        TextView tvText;
    }
}
