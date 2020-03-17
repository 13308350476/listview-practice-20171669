package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    int [] imageId = {R.mipmap.emoji_kids01,R.mipmap.emoji_kids02,R.mipmap.emoji_kids03,R.mipmap.emoji_kids04,R.mipmap.emoji_kids05,
            R.mipmap.emoji_kids06,R.mipmap.emoji_kids07,R.mipmap.emoji_kids08,R.mipmap.emoji_kids09,R.mipmap.emoji_kids10,R.mipmap.emoji_kids11, R.mipmap.emoji_kids12,
            R.mipmap.emoji_kids13,R.mipmap.emoji_kids14,R.mipmap.emoji_kids15,R.mipmap.emoji_kids16,R.mipmap.emoji_kids17,R.mipmap.emoji_kids18, R.mipmap.emoji_kids19,
            R.mipmap.emoji_kids20,R.mipmap.emoji_kids21,R.mipmap.emoji_kids22,R.mipmap.emoji_kids23,R.mipmap.emoji_kids24,R.mipmap.emoji_kids25,R.mipmap.emoji_kids26,
            R.mipmap.emoji_kids27,R.mipmap.emoji_kids28,R.mipmap.emoji_kids29,R.mipmap.emoji_kids30,R.mipmap.emoji_kids31,R.mipmap.emoji_kids32,R.mipmap.emoji_kids33};

    private String [] names = new String[]{"20161707", "20161713","20171591"," 20171592", "20171616" ,"20171627", "20171641" ,"20171649", "20171650",
            "20171653" ,"20171654", "20171655", "20171656", "20171659", "20171664", "20171666", "20171667", "20171668", "20171669", "20171670", "20171679",
            "20171688", "20171697", "20171705", "20171707" ,"20171714", "20171717", "20171731", "20171742", "20175064", "20175980", "20175990"};
    public static int num = 0;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,ShowInfo.class);
                switch(position){
                    case 0:
                        startActivity(intent);
                        num=0;
                        break;
                    case 1:
                        startActivity(intent);
                        num=1;
                        break;
                    case 2:
                        startActivity(intent);
                        num=2;
                        break;
                    case 3:
                        startActivity(intent);
                        num=3;
                        break;
                    case 4:
                        startActivity(intent);
                        num=4;
                        break;
                    case 5:
                        startActivity(intent);
                        num=5;
                        break;
                    case 6:
                        startActivity(intent);
                        num=6;
                        break;
                    case 7:
                        startActivity(intent);
                        num=7;
                        break;
                    case 8:
                        startActivity(intent);
                        num=8;
                        break;
                    case 9:
                        startActivity(intent);
                        num=9;
                        break;
                    case 10:
                        startActivity(intent);
                        num=10;
                        break;
                    case 11:
                        startActivity(intent);
                        num=11;
                        break;
                    case 12:
                        startActivity(intent);
                        num=12;
                        break;
                    case 13:
                        startActivity(intent);
                        num=13;
                        break;
                    case 14:
                        startActivity(intent);
                        num=14;
                        break;
                    case 15:
                        startActivity(intent);
                        num=15;
                        break;
                    case 16:
                        startActivity(intent);
                        num=16;
                        break;
                    case 17:
                        startActivity(intent);
                        num=17;
                        break;
                    case 18:
                        startActivity(intent);
                        num=18;
                        break;
                    case 19:
                        startActivity(intent);
                        num=19;
                        break;
                    case 20:
                        startActivity(intent);
                        num=20;
                        break;
                    case 21:
                        startActivity(intent);
                        num=21;
                        break;
                    case 22:
                        startActivity(intent);
                        num=22;
                        break;
                    case 23:
                        startActivity(intent);
                        num=23;
                        break;
                    case 24:
                        startActivity(intent);
                        num=24;
                        break;
                    case 25:
                        startActivity(intent);
                        num=25;
                        break;
                    case 26:
                        startActivity(intent);
                        num=26;
                        break;
                    case 27:
                        startActivity(intent);
                        num=27;
                        break;
                    case 28:
                        startActivity(intent);
                        num=28;
                        break;
                    case 29:
                        startActivity(intent);
                        num=29;
                        break;
                    case 30:
                        startActivity(intent);
                        num=30;
                        break;
                    case 31:
                        startActivity(intent);
                        num=31;
                        break;

                }
            }
        });
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
            vh.ivImage = (ImageView)view.findViewById(R.id.iv_list_item);
            view.setTag(vh);
        }else{
            view = convertView;
            vh = (ViewHolder) view.getTag();
        }
        ImageView imageView = (ImageView)view.findViewById(R.id.iv_list_item);
        TextView tvText = (TextView)view.findViewById(R.id.tv_list_item);
        imageView.setImageResource(imageId[position]);
        tvText.setText(names[position]);
        return view;
    }
}
    class ViewHolder{
        ImageView ivImage;
        TextView tvText;
    }
}
