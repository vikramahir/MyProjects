package com.example.vikram.mbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.vikram.mbapp.Alcorithms.AlgorithmProgram;

public class BM_Activity extends AppCompatActivity {
    private EditText editText;
    private TextView textView1, textView2, textView3,tvCase,textView5,tvHeap,tvBucket;
    private Button buttonBubble,buttonSelection,buttonMerge,buttonRedix,buttonAll,buttonHeap,buttonBucket;
    private RelativeLayout rl;
    private LinearLayout rlTextView;
    private static int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bm_);
        editText=(EditText) findViewById(R.id.etArray);
        textView1=(TextView) findViewById(R.id.tvBubbleTime);
        textView2=(TextView) findViewById(R.id.tvSelectionTime);
        textView3=(TextView) findViewById(R.id.tvMergeTime);
        tvCase=(TextView) findViewById(R.id.tvCase);
        textView5=(TextView) findViewById(R.id.tvRadixTime);
        buttonBubble=(Button) findViewById(R.id.btnBuuble);
        buttonSelection=(Button) findViewById(R.id.btnSelection);
        buttonMerge=(Button) findViewById(R.id.btnMerge);
        buttonRedix=(Button) findViewById(R.id.btnRadix);
        buttonAll=(Button) findViewById(R.id.btnAll);
        tvHeap=(TextView) findViewById(R.id.tvHeapTime);
        buttonHeap=(Button) findViewById(R.id.btnHeap);
        buttonBucket=(Button) findViewById(R.id.btnBuket);
        tvBucket=(TextView) findViewById(R.id.tvBuketTime);
        rl=(RelativeLayout) findViewById(R.id.layout1);
        rlTextView=(LinearLayout) findViewById(R.id.layout0);
       // tvCase.setVisibility(View.INVISIBLE);
    }
    public void doClick(View view){
        rl.setVisibility(View.VISIBLE);
        rlTextView.setVisibility(View.VISIBLE);
        tvCase.setVisibility(View.VISIBLE);
    }

    public void doGenerate(View view){
        try{
        int Size=Integer.parseInt(editText.getText().toString());
         array=new int[Size];
       switch (view.getId()) {
           case R.id.rbtnBest:
               for (int i = 0; i < Size; i++)
                   array[i] = i + 1;
               tvCase.setText("Your Array size : "+Size+"and case is Best ");
               break;
           case R.id.rbtnAvg:
               for (int i = 0; i < Size; i++)
                   array[i] = (int) ((Math.random()) * 100);
               tvCase.setText("Your Array size : "+Size+"and case is Average  ");
               break;
           case R.id.rbtnWorst:
               int count = 0;
               for (int i = Size; i > 0; i--)
                   array[count++] = i;
               tvCase.setText("Your Array size : "+Size+"and case is Worst ");
               break;
       }
       }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Pleas Enter Valid Number ",Toast.LENGTH_SHORT).show();
        }
    }

    public void doAlgorithms(View view){
        try {
            switch (view.getId()) {
                case R.id.btnBuuble:
                    buttonHeap.setEnabled(false);
                    buttonRedix.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBucket.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime = System.currentTimeMillis();

                    int[] bubble = array.clone();
                    AlgorithmProgram.bubbleSort(bubble);
                    long endTime = System.currentTimeMillis();
                    textView1.setText(String.valueOf(endTime - startTime));
                    break;
                case R.id.btnSelection:
                    buttonHeap.setEnabled(false);
                    buttonRedix.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBucket.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime1 = System.currentTimeMillis();
                    int[] selection = array.clone();
                    AlgorithmProgram.mergeSort(selection);

                    long endTime1 = System.currentTimeMillis();
                    textView2.setText(String.valueOf(endTime1 - startTime1));
                    break;
                case R.id.btnMerge:
                    buttonHeap.setEnabled(false);
                    buttonRedix.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonBucket.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime3 = System.currentTimeMillis();
                    int[] marge = array.clone();
                    AlgorithmProgram.redixSort(marge);
                    long endTime3 = System.currentTimeMillis();
                    textView3.setText(String.valueOf(endTime3 - startTime3));
                    break;
                case R.id.btnRadix:
                    buttonBucket.setEnabled(false);
                    buttonHeap.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime4 = System.currentTimeMillis();
                    int[] radix = array.clone();
                    AlgorithmProgram.redixSort(radix);
                    long endTime4 = System.currentTimeMillis();
                    textView5.setText(String.valueOf(endTime4 - startTime4));
                    break;
                case R.id.btnHeap:
                    buttonRedix.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonBucket.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime5 = System.currentTimeMillis();
                    int[] heap = array.clone();
                    AlgorithmProgram.heapSort(heap);
                    long endTime5 = System.currentTimeMillis();
                    tvHeap.setText(String.valueOf(endTime5 - startTime5));
                    break;
                case R.id.btnBuket:
                    buttonRedix.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonHeap.setEnabled(false);
                    buttonAll.setEnabled(false);
                    long startTime6 = System.currentTimeMillis();
                    int[] bucket = array.clone();
                    AlgorithmProgram.bucketSort(bucket);
                    long endTime6 = System.currentTimeMillis();
                    tvBucket.setText(String.valueOf(endTime6 - startTime6));
                    break;
                case R.id.btnAll:
                    buttonRedix.setEnabled(false);
                    buttonHeap.setEnabled(false);
                    buttonMerge.setEnabled(false);
                    buttonBubble.setEnabled(false);
                    buttonSelection.setEnabled(false);
                    buttonBucket.setEnabled(false);

                    long startTime10 = System.currentTimeMillis();
                    int[] bubble10 = array.clone();
                    AlgorithmProgram.bubbleSort(bubble10);
                    long endTime10 = System.currentTimeMillis();
                    textView1.setText(String.valueOf(endTime10 - startTime10));

                    long startTime11 = System.currentTimeMillis();
                    int[] selection11 = array.clone();
                    AlgorithmProgram.mergeSort(selection11);
                    long endTime11 = System.currentTimeMillis();
                    textView2.setText(String.valueOf(endTime11 - startTime11));

                    long startTime22 = System.currentTimeMillis();
                    int[] marge22 = array.clone();
                    AlgorithmProgram.redixSort(marge22);
                    long endTime22 = System.currentTimeMillis();
                    textView3.setText(String.valueOf(endTime22 - startTime22));

                    long startTime33 = System.currentTimeMillis();
                    int[] radix33 = array.clone();
                    AlgorithmProgram.redixSort(radix33);
                    long endTime33 = System.currentTimeMillis();
                    textView5.setText(String.valueOf(endTime33 - startTime33));

                    long startTime44 = System.currentTimeMillis();
                    int[] heap44 = array.clone();
                    AlgorithmProgram.heapSort(heap44);
                    long endTime44 = System.currentTimeMillis();
                    tvHeap.setText(String.valueOf(endTime44 - startTime44));

                    long startTime55 = System.currentTimeMillis();
                    int[] bucket55 = array.clone();
                    AlgorithmProgram.bucketSort(bucket55);
                    long endTime55 = System.currentTimeMillis();
                    tvBucket.setText(String.valueOf(endTime55 - startTime55));

                    break;


            }
        }catch (Exception e1){
            Toast.makeText(getApplicationContext(),"Select above case :",Toast.LENGTH_SHORT).show();
        }
    }


}
















