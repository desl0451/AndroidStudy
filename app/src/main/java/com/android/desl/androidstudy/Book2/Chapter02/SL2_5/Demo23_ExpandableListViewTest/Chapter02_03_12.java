package com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo23_ExpandableListViewTest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.android.desl.androidstudy.Book2.Chapter02.SL2_5.Demo22_GridViewTest.Chapter02_03_11;
import com.android.desl.androidstudy.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者:追风小宝
 */
public class Chapter02_03_12 extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book2_chapter02_03_12);
        //创建一个BaseExpandableListAdapter对象
        ExpandableListAdapter adapter = new BaseExpandableListAdapter() {
            int[] logos = new int[]{
                    R.drawable.book2_chapter02_03_12_t,
                    R.drawable.book2_chapter02_03_12_p,
                    R.drawable.book2_chapter02_03_12_z
            };
            private String[] armTypes = new String[]{
                    "神族兵种", "虫笑兵种", "人族兵种"
            };
            private String[][] arms = new String[][]{
                    {"狂战士", "龙骑士", "黑暗圣堂", "电兵"},
                    {"小狗", "刺蛇", "飞龙", "自爆飞机"},
                    {"机枪兵", "扩士MM", "幽灵"}
            };

            @Override
            public int getGroupCount() {
                return armTypes.length;
            }

            @Override
            public int getChildrenCount(int groupPosition) {
                return arms[groupPosition].length;
            }

            @Override
            public Object getGroup(int groupPosition) {
                return armTypes[groupPosition];
            }

            @Override
            public Object getChild(int groupPosition, int childPosition) {
                return arms[groupPosition][childPosition];
            }

            @Override
            public long getGroupId(int groupPosition) {
                return 0;
            }

            @Override
            public long getChildId(int groupPosition, int childPosition) {
                return childPosition;
            }

            @Override
            public boolean hasStableIds() {
                return true;
            }

            @Override
            public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
                LinearLayout li = new LinearLayout(Chapter02_03_12.this);
                li.setOrientation(LinearLayout.HORIZONTAL);
                ImageView logo = new ImageView(Chapter02_03_12.this);
                logo.setImageResource(logos[groupPosition]);
                li.addView(logo);
                TextView textView = getTextView();
                textView.setText(getGroup(groupPosition).toString());
                li.addView(textView);
                return li;
            }

            @Override
            public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
                TextView textView = getTextView();
                textView.setText(getChild(groupPosition, childPosition).toString());
                return textView;
            }

            @Override
            public boolean isChildSelectable(int groupPosition, int childPosition) {
                return true;
            }

            private TextView getTextView() {
                AbsListView.LayoutParams lp = new AbsListView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 64);
                TextView textView = new TextView(Chapter02_03_12.this);
                textView.setLayoutParams(lp);
                textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
                textView.setPadding(36, 0, 0, 0);
                textView.setTextSize(20);
                return textView;
            }
        };
        ExpandableListView expandListView = (ExpandableListView) findViewById(R.id.list);
        expandListView.setAdapter(adapter);
    }
}