package com.app.cekongkirkeyboard.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.cekongkirkeyboard.R;
import com.app.cekongkirkeyboard.models.ShippingCouriers;

import java.util.ArrayList;
import java.util.List;

public class ListShippingAdapter extends BaseAdapter {

	Context context;
	List<ShippingCouriers> data;

	public ListShippingAdapter(Context context, ArrayList<ShippingCouriers> listdata) {
		this.context = context;
		this.data = listdata;
	}

	public void UpdateListShippingAdapter(ArrayList<ShippingCouriers> listdata) {
		this.data = listdata;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return this.data.size();
	}

	@Override
	public Object getItem(int position) {
		return this.data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public static class ViewHolder {
		public ImageView ivlogo;
		public TextView tvtype;
		public TextView tvhours;
		public TextView tvcost;
		public CheckBox cbchecked;
		public int position;
	}

	@SuppressLint("InflateParams")
	@Override
	public View getView(int position, View convertView, final ViewGroup parent) {

		final ViewHolder view;
		LayoutInflater inflator =  LayoutInflater.from(parent.getContext());
		if(convertView==null) {
			view = new ViewHolder();
			convertView = inflator.inflate(R.layout.custom_shipping_result_item, null);
			view.ivlogo = (ImageView) convertView.findViewById(R.id.ivlogo);
			view.tvtype = (TextView) convertView.findViewById(R.id.tvtype);
			view.tvhours = (TextView) convertView.findViewById(R.id.tvhours);
			view.tvcost = (TextView) convertView.findViewById(R.id.tvcost);
			view.cbchecked = (CheckBox) convertView.findViewById(R.id.cbchecked);
			
			

			convertView.setTag(view);
		} else {
			view = (ViewHolder) convertView.getTag();
		}

		final ShippingCouriers object = data.get(position);
		view.tvtype.setText(object.getService());
		view.tvhours.setText(object.getEtd() + " " + context.getResources().getString(R.string.txt_hours));

		if(!object.getValue().equals("")) {
			float amount = Float.parseFloat(object.getValue());
			float i2=amount/1000;
			view.tvcost.setText("Rp." + " " +String.format("%.3f", i2));
		}

		view.cbchecked.setChecked(object.getChecked());

		view.cbchecked.setTag(position);
		view.cbchecked.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				int index = (int) v.getTag();
				/*ShippingCouriers couriers = data.get(index);
				couriers.setChecked(view.cbchecked.isChecked()); 
				data.set(index, couriers);
				notifyDataSetChanged();*/

				Intent i = new Intent("com.app.cekongkirkeyboard.CEK_SELECT");
				i.putExtra("index", index);
				i.putExtra("setchecked", view.cbchecked.isChecked());

				context.sendBroadcast(i);
			}
		});
		
		if(object.getCode().equalsIgnoreCase("jne")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_jnecourier);
		} else if(object.getCode().equalsIgnoreCase("tiki")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_tiki);
		} else if(object.getCode().equalsIgnoreCase("pos")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_pos);
		} else if(object.getCode().equalsIgnoreCase("jnt")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_jnt);
		} else if(object.getCode().equalsIgnoreCase("j&t")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_jnt);
		} else if(object.getCode().equalsIgnoreCase("expedito")) {
			view.ivlogo.setBackgroundResource(R.drawable.shipping_expeditologo);
		} else if(object.getCode().equalsIgnoreCase("jet")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_jet);
		} else if(object.getCode().equalsIgnoreCase("wahana")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_wahana);
		} else if(object.getCode().equalsIgnoreCase("dse")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_ic_dse);
		} else if(object.getCode().equalsIgnoreCase("pcp")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_pcp);
		} else if(object.getCode().equalsIgnoreCase("rpx")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_rpx);
		} else if(object.getCode().equalsIgnoreCase("sap")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_sap);
		} else if(object.getCode().equalsIgnoreCase("sicepat")){
			view.ivlogo.setBackgroundResource(R.drawable.shipping_sicepat);
		} else {
			view.ivlogo.setBackgroundResource(R.drawable.shipping_white_bg);
		}
		
		convertView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View convertView) {
				
			}
		});

		return convertView;
	}
}
