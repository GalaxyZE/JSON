package com.json.zillusion.myjson;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewDebug;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.json.zillusion.myjson.FGO_RelateData.*;
import static com.json.zillusion.myjson.FGO_RelateData_Material.str_RequiredMaterials;
import static com.json.zillusion.myjson.FGO_RelateData_SkillDes.Skill_Describe;
import static com.json.zillusion.myjson.FGO_RelateData_SkillDes.Skill_Describe_Effect;
import static com.json.zillusion.myjson.FGO_RelateData_NPinfo.NP_DescribeEn;

public class MainActivity extends AppCompatActivity {
    private String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //region Test
        TextView jsview=(TextView) findViewById(R.id.textview);
        //new TransTask().execute("https://ms0266378.github.io/fgo.query/JSONTest.html");

        // Read from the database

        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        String str_selectedno="10";
        DatabaseReference ref=database.child("Servant").child("NO_"+str_selectedno);
        /*
        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                try{
                    FB_FGOData FGODataRead = dataSnapshot.getValue(FB_FGOData.class);

                  //Log.d("DataRead", "onDataChange: "+FGODataRead.getClass_Describe4());

                }catch (Exception e)
                {
                    Log.d("DataRead","Error:"+e.toString());
                }

                // ...
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w("DataRead", "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        ref.addValueEventListener(postListener);
        */
        //endregion


        //region WriteData Region


        for (int i=0;i<208;i++)
        {
           //FB_FGOData json=new FB_FGOData(itemname_Chinese[i],itemname_EN[i],itemdes[i],itemname_China[i]);//Add Name

            FB_FGOData json=new FB_FGOData(itemname_Chinese[i],itemname_EN[i],itemdes[i],itemname_China[i],
                    Integer.valueOf(textid_Servent_Status[i][1]),Integer.valueOf(textid_Servent_Status[i][2]),
                    Integer.valueOf(textid_Servent_Status[i][3]),Integer.valueOf(textid_Servent_Status[i][4]),
                    Integer.valueOf(textid_Servent_Status[i][5]),Integer.valueOf(textid_Servent_Status[i][6]),
                    Integer.valueOf(textid_Servent_Status[i][7]),Integer.valueOf(textid_Servent_Status[i][8]),
                    Integer.valueOf(textid_Servent_Status[i][9]),Integer.valueOf(textid_Servent_Status[i][10]),
                    Servent_Class_Describe[i][0],Servent_Class_Describe[i][1],Servent_Class_Describe[i][2],Servent_Class_Describe[i][3],
                    Integer.valueOf(CommandCard[i][0]),Integer.valueOf(CommandCard[i][1]),Integer.valueOf(CommandCard[i][2]),
                    Skill_Describe[i][0],Skill_Describe[i][1],Skill_Describe[i][2],Skill_Describe[i][3],Skill_Describe[i][4],Skill_Describe[i][5],
                    Skill_Describe_Effect[i][0],Skill_Describe_Effect[i][1],Skill_Describe_Effect[i][2],Skill_Describe_Effect[i][3],Skill_Describe_Effect[i][4],Skill_Describe_Effect[i][5],
                    Skill_Describe_Effect[i][6],Skill_Describe_Effect[i][7],Skill_Describe_Effect[i][8],Skill_Describe_Effect[i][9],
                    Skill_Describe_Effect[i][10],Skill_Describe_Effect[i][11],Skill_Describe_Effect[i][12],Skill_Describe_Effect[i][13],Skill_Describe_Effect[i][14],Skill_Describe_Effect[i][15],
                    Skill_Describe_Effect[i][16],Skill_Describe_Effect[i][17],Skill_Describe_Effect[i][18],Skill_Describe_Effect[i][19],
                    Skill_Describe_Effect[i][20],Skill_Describe_Effect[i][21],Skill_Describe_Effect[i][22],Skill_Describe_Effect[i][23],Skill_Describe_Effect[i][24],Skill_Describe_Effect[i][25],
                    Skill_Describe_Effect[i][26],Skill_Describe_Effect[i][27],Skill_Describe_Effect[i][28],Skill_Describe_Effect[i][29],
                    Integer.valueOf(NP_DescribeEn[i][0]),NP_DescribeEn[i][1],NP_DescribeEn[i][2],NP_DescribeEn[i][3],NP_DescribeEn[i][4],NP_DescribeEn[i][5],
                    NP_DescribeEn[i][6],NP_DescribeEn[i][7],NP_DescribeEn[i][8],NP_DescribeEn[i][9],NP_DescribeEn[i][10],NP_DescribeEn[i][11],
                    NP_DescribeEn[i][12],NP_DescribeEn[i][13],NP_DescribeEn[i][14],NP_DescribeEn[i][15],NP_DescribeEn[i][16],
                    str_RequiredMaterials[i][0],str_RequiredMaterials[i][1],Integer.valueOf(str_RequiredMaterials[i][2]),str_RequiredMaterials[i][3],
                    Integer.valueOf(str_RequiredMaterials[i][4]),str_RequiredMaterials[i][5],Integer.valueOf(str_RequiredMaterials[i][6]),str_RequiredMaterials[i][7],
                    Integer.valueOf(str_RequiredMaterials[i][8]),
                    str_RequiredMaterials[i][9],str_RequiredMaterials[i][10],Integer.valueOf(str_RequiredMaterials[i][11]),str_RequiredMaterials[i][12],Integer.valueOf(str_RequiredMaterials[i][13]),
                    str_RequiredMaterials[i][14],Integer.valueOf(str_RequiredMaterials[i][15]),str_RequiredMaterials[i][16],Integer.valueOf(str_RequiredMaterials[i][17]),
                    str_RequiredMaterials[i][18],str_RequiredMaterials[i][19],Integer.valueOf(str_RequiredMaterials[i][20]),str_RequiredMaterials[i][21],Integer.valueOf(str_RequiredMaterials[i][22]),
                    str_RequiredMaterials[i][23],Integer.valueOf(str_RequiredMaterials[i][24]),str_RequiredMaterials[i][25],Integer.valueOf(str_RequiredMaterials[i][26]),
                    str_RequiredMaterials[i][27], str_RequiredMaterials[i][28],Integer.valueOf(str_RequiredMaterials[i][29]), str_RequiredMaterials[i][30],Integer.valueOf(str_RequiredMaterials[i][31]),
                    str_RequiredMaterials[i][32],Integer.valueOf(str_RequiredMaterials[i][33]), str_RequiredMaterials[i][34],Integer.valueOf(str_RequiredMaterials[i][35])
            );
            Task<Void> DR_write=database.child("Servant").child("NO_"+ String.valueOf(i)).setValue(json);
            //Log.d("add", String.valueOf(i)+"-"+json.getNameCH()+"-"+json.getNameEN());
        }



        //endregion




    }
    class TransTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(params[0]);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(url.openStream()));
                String line = in.readLine();
                while(line!=null){
                    Log.d("HTTP", line);
                    sb.append(line);
                    line = in.readLine();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return sb.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d(TAG, "onPostExecute: "+"JSON");
            //TextView text=(TextView) findViewById(R.id.textview);
            //text.setText(s);
           //region
            ArrayList<JsonTrans> trans = new ArrayList<>();
            List<HashMap<String,String>> alist=new ArrayList<HashMap<String,String>>();
            Gson gson=new Gson();
            try
            {
                Type listType = new TypeToken<ArrayList<JsonTrans>>() {}.getType();
                ArrayList<JsonTrans> jsonArr = gson.fromJson(s, listType);
                StringBuffer sb = new StringBuffer();
                for(JsonTrans obj : jsonArr){
                    sb.append("obj chanel:" + obj.getNO()+ "\n");
                    sb.append("obj start time:" + obj.getNameEN() + "\n");
                    sb.append("obj end time:" + obj.getNameJP() + "\n");
                    sb.append("obj week:" + obj.getNameCH() + "\n");
                    HashMap<String,String> hm=new HashMap<String, String>();
                    hm.put("NO",obj.getNO());
                    hm.put("NameEN",obj.getNameEN());
                    hm.put("NameJP",obj.getNameJP());
                    hm.put("NameCH",obj.getNameCH());
                    alist.add(hm);
                }
            }
            catch (JsonSyntaxException e)
            {
                Log.d("GsonCatch:", "onPostExecute:"+e.toString());
            }



            //endregion


            Log.d("List", alist.toString());

            ListView js=(ListView) findViewById(R.id.listview);
            String []from={"NO","NameEN","NameJP","NameCH"};
            int []to={R.id.textNO,R.id.textEN,R.id.textJP,R.id.textCH};
            final SimpleAdapter ad=new SimpleAdapter(getBaseContext(), alist,R.layout.jsonlayout,from,to);
            js.setAdapter(ad);

            js.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this,String.valueOf(++position),Toast.LENGTH_SHORT).show();
                }
            });
            js.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                @Override
                public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this,"Long Clicked",Toast.LENGTH_SHORT).show();
                    return false;
                }
            });

            SearchView sv=(SearchView) findViewById(R.id.searchview);
            sv.setQueryHint("Input");
            sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    ad.getFilter().filter(newText);
                    return false;
                }
            });
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
