public class delete_update extends AppCompatActivity {
  private EditText mweightAmount_editText;
  private EditText mweightDate_editText; 
  private Button btndelete; 
  private Button btnupdate; 
  private String key; 
  private String WeightAmount; 
  private String WeightDate;

  @Override 
  protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); 
  setContentView(R.layout.activity_delete_update);

   key = getIntent().getStringExtra("key"); 
   WeightAmount = getIntent().getStringExtra("WeightAmount"); 
   WeightDate = getIntent().getStringExtra("WeightDate"); 
   mweightAmount_editText =(EditText) findViewById(R.id.updateweight_editTxt); 
   mweightAmount_editText.setText(WeightAmount); 
   mweightDate_editText = (EditText) findViewById(R.id.dateupdateweight_editTxt); 
   mweightDate_editText.setText(WeightDate); btndelete = (Button)findViewById(R.id.btndelete); 
   btnupdate = (Button)findViewById(R.id.btnupdate);
   
   btnupdate.setOnClickListener(new View.OnClickListener() { 
       @Override 
       public void onClick(View v){ 
       Weight weight = new Weight(); 
       weight.setWeightAmount(mweightAmount_editText.getText().toString()); 
       weight.setWeightDate(mweightDate_editText.getText().toString());
      
        
       }
   // Link data base
   }


}
                                
                             
