package com.app.cekongkirkeyboard.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.cekongkirkeyboard.R;
import com.app.cekongkirkeyboard.SoftKeyboard;
import com.app.cekongkirkeyboard.models.cities;

import java.util.ArrayList;

public class ListCityAdapter extends BaseAdapter {

	ArrayList<cities> listcity = new ArrayList<>();
	Context context;

	public ListCityAdapter(Context context, ArrayList<cities> listcity) {
		this.context = context;
		this.listcity = listcity;
	}

	public void UpdateListCityAdapter(ArrayList<cities> listcity) {
		this.listcity = listcity;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return listcity.size();
	}

	@Override
	public Object getItem(int position) {
		return listcity.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public static class ViewHolder {
		public TextView text_ac;
		public int position;
	}

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, final ViewGroup parent) {

		final ViewHolder view;
		LayoutInflater inflator =  LayoutInflater.from(parent.getContext());
		if(convertView==null) {
			view = new ViewHolder();
			convertView = inflator.inflate(R.layout.ac_item_list, null);

			view.text_ac = (TextView) convertView.findViewById(R.id.text_ac);

			convertView.setTag(view);
		} else {
			view = (ViewHolder) convertView.getTag();
		}

		final cities data = listcity.get(position);
		view.text_ac.setText(data.getCity_name());
		
		convertView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View convertView) {
				Intent i = new Intent("com.app.cekongkirkeyboard.SELECT_CITY");
				i.putExtra("city_selected", data);
				context.sendBroadcast(i);
			}
		});

		return convertView;
	}
}
