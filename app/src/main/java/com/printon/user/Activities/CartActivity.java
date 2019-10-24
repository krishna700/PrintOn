package com.printon.user.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.printon.user.R;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

import java.nio.BufferUnderflowException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CartActivity extends AppCompatActivity implements PaymentResultListener {

    @BindView(R.id.proceed)
    LinearLayout linearLayout;

  @Override
    protected void onCreate(Bundle savedInstanceState)
  {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_cart);
      (CartActivity.this).getSupportActionBar().hide();
      ButterKnife.bind(this);

      Checkout.preload(getApplicationContext());
      linearLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startPayment();
          }
      });

  }

    public void startPayment() {

        Checkout checkout = new Checkout();
        checkout.setImage(R.drawable.logo);
        final Activity activity = this;


        try {
            JSONObject options = new JSONObject();


            options.put("name", "PrintOn");
            options.put("description", "Order No. #123456");
            options.put("order_id", "order_9A33XWu170gUtm");
            options.put("currency", "INR");
            options.put("amount", "500");

            JSONObject preFill = new JSONObject();
            preFill.put("email", "test@solcode.in");
            preFill.put("contact", "9851700100");

            options.put("prefill", preFill);

            checkout.open(activity, options);
        } catch(Exception e) {
            Log.e("ds", "Error in starting Razorpay Checkout", e);
        }
    }
    @Override
    public void onPaymentSuccess(String razorpayPaymentID) {
        /**
         * Add your logic here for a successful payment response
         */
        Toast.makeText(this,"Payment success",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPaymentError(int code, String response) {
        /**
         * Add your logic here for a failed payment response
         */
    }

}
