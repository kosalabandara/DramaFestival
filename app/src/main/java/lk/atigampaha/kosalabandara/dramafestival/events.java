package lk.atigampaha.kosalabandara.dramafestival;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class events extends AppCompatActivity {

    ListView mListView;

    int[] Image = {R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.k,
            R.drawable.l,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);

        mListView=(ListView) findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        mListView.setAdapter(customAdapter);
    }


    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return Image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view1= getLayoutInflater().inflate(R.layout.list,null);
            ImageView mImageView = (ImageView) view1.findViewById(R.id.image);

            mImageView.setImageResource(Image[position]);
            return view1;
        }
    }
}