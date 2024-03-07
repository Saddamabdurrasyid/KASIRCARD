package com.example.kasircard;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String itemName = intent.getStringExtra("itemName");
        String itemPrice = intent.getStringExtra("itemPrice");
        int itemImageResId = intent.getIntExtra("itemImageResId", R.drawable.kumpulannasi);

        TextView itemNameTextView = findViewById(R.id.itemNameTextView);
        itemNameTextView.setText(itemName);

        TextView itemPriceTextView = findViewById(R.id.itemPriceTextView);
        itemPriceTextView.setText(itemPrice);

        ImageView itemImageView = findViewById(R.id.itemImageView);
        itemImageView.setImageResource(itemImageResId);

        TextView itemDescriptionTextView = findViewById(R.id.itemDescriptionTextView);
        itemDescriptionTextView.setText("INI ADALAH MAKANAN TERBAIK DIBUMI , SILAHKAN DIPESAN");


        Button shareButton = findViewById(R.id.shareButton);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareItem(itemName, itemPrice, itemImageResId);
            }
        });
    }

    private void shareItem(String itemName, String itemPrice, int itemImageResId) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), itemImageResId);
        Uri imageUri = getBitmapUri(bitmap);
        String shareText = "Check out this item:\n" + itemName + "\nPrice: " + itemPrice;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*");
        shareIntent.putExtra(Intent.EXTRA_STREAM, imageUri);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
        startActivity(Intent.createChooser(shareIntent, "Share Item via"));
    }

    private Uri getBitmapUri(Bitmap bitmap) {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Item Image", null);
        return Uri.parse(path);


    }
}

