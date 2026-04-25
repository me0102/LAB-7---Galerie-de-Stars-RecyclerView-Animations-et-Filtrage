<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="12dp"
    android:layout_marginBottom="4dp">

    <de.hdodenhof.circleimageview.CircleImageView
        android:id="@+id/img_profile"
        android:layout_width="90dp"
        android:layout_height="90dp"
        android:src="@drawable/ic_celeb" />

    <TextView
        android:id="@+id/txt_celeb_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_toEndOf="@id/img_profile"
        android:layout_marginStart="20dp"
        android:layout_marginTop="10dp"
        android:text="Nom de la célébrité"
        android:textStyle="bold"
        android:textSize="20sp" />

    <RatingBar
        android:id="@+id/rating_celeb"
        style="?android:attr/ratingBarStyleSmall"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/txt_celeb_name"
        android:layout_toEndOf="@id/img_profile"
        android:layout_marginStart="20dp"
        android:layout_marginTop="8dp"
        android:isIndicator="true"
        android:numStars="5"
        android:stepSize="0.1" />

</RelativeLayout>