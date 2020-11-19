package com.parkho.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindList();
    }

    private void bindList() {
        String countryList[] = {"Korea", "China", "Japan", "America", "NewZealand"};
        /*
        String countryList[] = {"Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
                , "Korea", "China", "Japan", "America", "NewZealand"
        };
        */

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countryList);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);
    }
}
