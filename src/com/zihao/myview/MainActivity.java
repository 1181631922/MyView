package com.zihao.myview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;

/**
 * 水平滑动视图---利用HorizontalScrollView+水平线性布局+自定义子视图完成
 * 
 * @author zihao
 * 
 */
public class MainActivity extends Activity {

	private LinearLayout groupView;// 线性水平布局对象

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	/**
	 * 初始化视图
	 */
	private void initView() {
		groupView = (LinearLayout) findViewById(R.id.middle_layout);

		// 新增子布局对象到父布局中
		for (int i = 0; i < 8; i++) {
			ImageView childImg;// 子视图ImageView
			TextView childName;// 子视图名称
			View childView;// 子视图View

			// 初始化子布局
			childView = LayoutInflater.from(this).inflate(
					R.layout.child_layout, null);
			childImg = (ImageView) childView.findViewById(R.id.child_img);
			childName = (TextView) childView.findViewById(R.id.child_name);

			childImg.setBackgroundResource(R.drawable.ic_launcher);
			childName.setText("测试子视图" + i);
			groupView.addView(childView);// 将childView添加到父布局
		}
	}

}