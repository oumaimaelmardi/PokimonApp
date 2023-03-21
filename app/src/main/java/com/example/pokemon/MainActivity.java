package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  //GridView gridView;
  //String [] pokiName = {"poki,test,fire,drago,pokimon,butter"} ;
  //int[] ImagesPoki={R.drawable.poki,R.drawable.pk,R.drawable.pokemon,R.drawable.buttf,R.drawable.poki,R.drawable.test};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickListener();
        clickListener2();
        clickListener3();
        clickListener4();
        clickListener5();
        clickListener6();

       /* gridView=findViewById(R.id.global);
        CustomAdapter customAdapter=new CustomAdapter();

        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), DetailPoki.class);
                intent.putExtra("name",pokiName[i]);
                intent.putExtra("images",ImagesPoki[i]);
                startActivity(intent);
            }
        });*/
    }
     public void clickListener(){
         //ImageView imagePoki=findViewById(R.id.card) ;
         CardView imagePoko = findViewById(R.id.card1);
         imagePoko.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openCard1();
             }
         });}

    public void clickListener2(){
        //ImageView imagePoki=findViewById(R.id.card) ;
        CardView fairy = findViewById(R.id.card2);
        fairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardFairy();
            }
        });}

    public void clickListener3(){
        //ImageView imagePoki=findViewById(R.id.card) ;
        CardView plume = findViewById(R.id.card3);
        plume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardPlume();
            }


        });}
    public void clickListener4(){
        //ImageView imagePoki=findViewById(R.id.card) ;
        CardView jiggly = findViewById(R.id.card4);
        jiggly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardJiggly();
            }


        });}
    public void clickListener5(){
        //ImageView imagePoki=findViewById(R.id.card) ;
        CardView butter = findViewById(R.id.card5);
        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardButter();
            }


        });}
public void clickListener6(){
        //ImageView imagePoki=findViewById(R.id.card) ;
        CardView grow = findViewById(R.id.card6);
        grow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCardGrow();
            }


        });}

    private void openCardGrow() {
        Intent intent = new Intent(getApplicationContext(), Growlithe.class);
        startActivity(intent);
    }

    private void openCardButter() {
        Intent intent = new Intent(getApplicationContext(), Butterfree.class);
        startActivity(intent);
    }

    private void openCardJiggly() {
        Intent intent = new Intent(getApplicationContext(), Jigglypuff.class);
        startActivity(intent);
    }

    private void openCardPlume() {
        Intent intent = new Intent(getApplicationContext(), Villeplume.class);
        startActivity(intent);
    }
    private void openCardFairy() {
        Intent intent = new Intent(getApplicationContext(), Fairy.class);
        startActivity(intent);
    }


    public void openCard1() {
             Intent intent = new Intent(getApplicationContext(), DetailPoki.class);
             startActivity(intent);
         }

  /*  private class CustomAdapter extends
            BaseAdapter{

        @Override
        public int getCount() {
            return ImagesPoki.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1=getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name =view1.findViewById(R.id.pokemons);
            ImageView image=view1.findViewById(R.id.images);
            name.setText(pokiName[i]);
            image.setImageResource(ImagesPoki[i]);
            return view1;
        }
    }*/
}