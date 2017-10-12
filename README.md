## 自定义圆角ImageView,包括任意圆角矩形、圆形、椭圆形、定义图形边框与颜色，进度条等 ##

# 效果图 #
![](https://i.imgur.com/FN5TD4M.jpg)

# gradle引用 #
    compile 'com.lqm:RoundImageView:1.0.0'

# 示例代码#

    <?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/	apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center_horizontal"
    android:orientation="vertical">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <com.lqm.roundview.RoundImageView
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_margin="10dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_1"
            app:corner_radius="20dp" />

        <com.lqm.roundview.RoundImageView
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_margin="10dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_1"
            app:rightBottom_corner_radius="20dp"
            app:rightTop_corner_radius="10dp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <com.lqm.roundview.RoundImageView
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_margin="10dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_2"
            app:border_color="#68f"
            app:border_width="5dp"
            app:type="circle" />

        <com.lqm.roundview.RoundImageView
            android:layout_width="120dp"
            android:layout_height="80dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_2"
            app:border_color="#9999"
            app:border_width="1dp"
            app:type="oval" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <com.lqm.roundview.RoundImageView
            android:id="@+id/iv_progress"
            android:layout_width="130dp"
            android:layout_height="130dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_3"
            app:border_color="#93dfdd"
            app:border_width="5dp"
            app:type="circle"
            android:layout_margin="10dp"
            />

        <com.lqm.roundview.RoundImageView
            android:layout_width="130dp"
            android:layout_height="130dp"
            android:scaleType="fitXY"
            android:src="@mipmap/image_3"
            app:border_color="#7195ae"
            app:border_width="5dp"
            app:type="circle"
            app:progress_border="120"
            app:progress_color="#eda167"
            android:layout_margin="10dp"
            />
    </LinearLayout>
</LinearLayout>

