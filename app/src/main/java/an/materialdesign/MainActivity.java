package an.materialdesign;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import an.materialdesign.CoomonMethods.Common;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button dialog = (Button) findViewById(R.id.materialDesingDialog);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogBoxToUpdateField(MainActivity.this);


            }
        });

        Button profileButton = (Button) findViewById(R.id.profile_button);
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                profileDilog(MainActivity.this);
            }
        });


        Button social = (Button) findViewById(R.id.social_media);
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                socialMedia(MainActivity.this);
            }
        });


        Button materilImage = (Button) findViewById(R.id.materialDesign);
        materilImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materiLImageDialogBox(MainActivity.this);
            }
        });


    }


    public void dialogBoxToUpdateField(final Context context) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View promtView = inflater.inflate(R.layout.dialog_material, null);


        final Dialog materialDialog = new Dialog(context);


        materialDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        materialDialog.setContentView(promtView);
        materialDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        materialDialog.setCanceledOnTouchOutside(true);

        final TextView title = (TextView) promtView.findViewById(R.id.title);
        final TextView message = (TextView) promtView.findViewById(R.id.textMessage);

        final Button cancel = (Button) promtView.findViewById(R.id.cancel);
        final Button okey = (Button) promtView.findViewById(R.id.okey);


        okey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Accpet");
                materialDialog.dismiss();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Cancel");
                materialDialog.dismiss();
            }
        });

        final LinearLayout parentLinearLayout = (LinearLayout) promtView.findViewById(R.id.parentLinearLayout);

        parentLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDialog.dismiss();
            }
        });

        materialDialog.setCancelable(true);
        materialDialog.show();

        materialDialog.getWindow()
                .setLayout((int) (Common.getScreenWidth(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT);
        materialDialog.getWindow().setGravity(Gravity.CENTER);


    }


    public void socialMedia(final Context context) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View promtView = inflater.inflate(R.layout.social_media, null);


        final Dialog materialDialog = new Dialog(context);


        materialDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        materialDialog.setContentView(promtView);
        materialDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        materialDialog.setCanceledOnTouchOutside(true);

        final CheckBox fb_check = (CheckBox) promtView.findViewById(R.id.checkbox_fb);
        final CheckBox twitter_check = (CheckBox) promtView.findViewById(R.id.check_box_twi);

        final CheckBox google_check = (CheckBox) promtView.findViewById(R.id.check_box_google);
        final CheckBox insta_check = (CheckBox) promtView.findViewById(R.id.check_box_insta);

        final Button choose = (Button) promtView.findViewById(R.id.chose);
        final Button clear = (Button) promtView.findViewById(R.id.clear);


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Cleared Selected");
                if (fb_check.isChecked())
                    fb_check.setChecked(false);

                if (google_check.isChecked())
                    google_check.setChecked(false);

                if (twitter_check.isChecked())
                    twitter_check.setChecked(false);

                if (insta_check.isChecked())
                    insta_check.setChecked(false);


            }
        });

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Choose");
                materialDialog.dismiss();
            }
        });

        final LinearLayout parentLinearLayout = (LinearLayout) promtView.findViewById(R.id.parentLinearLayout);

        parentLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDialog.dismiss();
            }
        });

        materialDialog.setCancelable(true);
        materialDialog.show();

        materialDialog.getWindow()
                .setLayout((int) (Common.getScreenWidth(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT);
        materialDialog.getWindow().setGravity(Gravity.CENTER);


    }

    public void materiLImageDialogBox(final Context context) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View promtView = inflater.inflate(R.layout.material_images, null);
        final Dialog materialDialog = new Dialog(context);
        materialDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        materialDialog.setContentView(promtView);
        materialDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        materialDialog.setCanceledOnTouchOutside(true);


        final Button googlePlay = (Button) promtView.findViewById(R.id.google_play);
        final Button later = (Button) promtView.findViewById(R.id.later);


        later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Later");

                materialDialog.dismiss();


            }
        });


        googlePlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Common.showToast(context, "Go to GooglePlay");
                materialDialog.dismiss();
            }
        });

        final LinearLayout parentLinearLayout = (LinearLayout) promtView.findViewById(R.id.parentLinearLayout);

        parentLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDialog.dismiss();
            }
        });

        materialDialog.setCancelable(true);
        materialDialog.show();

        materialDialog.getWindow()
                .setLayout((int) (Common.getScreenWidth(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT);
        materialDialog.getWindow().setGravity(Gravity.CENTER);


    }


    public void profileDilog(final Context context) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View promtView = inflater.inflate(R.layout.profile_alert_dialog, null);
        final Dialog materialDialog = new Dialog(context);
        materialDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        materialDialog.setContentView(promtView);
        materialDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        materialDialog.setCanceledOnTouchOutside(true);

        materialDialog.setCancelable(true);
        materialDialog.show();

        materialDialog.getWindow()
                .setLayout((int) (Common.getScreenWidth(this) * 0.9), ViewGroup.LayoutParams.WRAP_CONTENT);
        materialDialog.getWindow().setGravity(Gravity.CENTER);


    }
}
