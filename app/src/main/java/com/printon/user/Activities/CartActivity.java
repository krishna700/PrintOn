package com.printon.user.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.printon.user.R;

import com.shreyaspatil.EasyUpiPayment.EasyUpiPayment;
import com.shreyaspatil.EasyUpiPayment.listener.PaymentStatusListener;
import com.shreyaspatil.EasyUpiPayment.model.TransactionDetails;



import butterknife.BindView;
import butterknife.ButterKnife;

public class CartActivity extends AppCompatActivity implements PaymentStatusListener {

    @BindView(R.id.proceed)
    LinearLayout linearLayout;

     EasyUpiPayment easyUpiPayment;

  @Override
    protected void onCreate(Bundle savedInstanceState)
  {

      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_cart);
      (CartActivity.this).getSupportActionBar().hide();
      ButterKnife.bind(this);

      easyUpiPayment= new EasyUpiPayment.Builder()
              .with(this)
              .setPayeeVpa("9851700100@paytm")
              .setPayeeName("PrintOn")
              .setTransactionId("7274423")
              .setTransactionRefId("34232423")
              .setDescription("Food")
              .setAmount("1.01")
              .build();
      linearLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              easyUpiPayment.startPayment();
          }
      });
      easyUpiPayment.setPaymentStatusListener(this);

  }


    @Override
    public void onTransactionCompleted(TransactionDetails transactionDetails) {
        // Transaction Completed
        Log.d("TransactionDetails", transactionDetails.toString());

    }

    @Override
    public void onTransactionSuccess() {
        // Payment Success
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTransactionSubmitted() {
        // Payment Pending
        Toast.makeText(this, "Pending | Submitted", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTransactionFailed() {
        // Payment Failed
        Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onTransactionCancelled() {
        // Payment Cancelled by User
        Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();

    }
}
