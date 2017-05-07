package com.example.vinalpatel.entry_log;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Model extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        // Spinner element
        Spinner spinner_model = (Spinner) findViewById(R.id.spinner_model);
        Spinner spinner_supplier = (Spinner) findViewById(R.id.spinner_supplier);
        Spinner spinner_date = (Spinner) findViewById(R.id.spinner_date);
        Spinner spinner_unit = (Spinner) findViewById(R.id.spinner_unit);

        // Spinner click listener
        spinner_model.setOnItemSelectedListener(this);

        List<String> models = new ArrayList<String>();

        models.add("	10inch intel processor 1/8G	");
        models.add("	10inch netbook	");
        models.add("	10Ci	");
        models.add("	2.4inch feature phone	");
        models.add("	2G4*	");
        models.add("	2G5 	");
        models.add("	3 SIM PDA	");
        models.add("	3-SIM 4.7inch PDA	");
        models.add("	3.5inch feature phone	");
        models.add("	3.5inch feature phone	");
        models.add("	3D glasses 	");
        models.add("	3D glasses 	");
        models.add("	3D VR glass	");
        models.add("	3G10	");
        models.add("	3G4 	");
        models.add("	3G4Z	");
        models.add("	3G5	");
        models.add("	3G5	");
        models.add("	3G5 (1G/8G)	");
        models.add("	3G5 (1G/8G)	");
        models.add("	3G5 (1G/8G)	");
        models.add("	3G5 1G/8G	");
        models.add("	3G5 1G/8G	");
        models.add("	3G5 512/4G ddr3	");
        models.add("	3G5 MTK 6580 1G/8G	");
        models.add("	3G5Z high (1g&8g)	");
        models.add("	3G5Z high MT 6580 (1G/8G)	");
        models.add("	3G6	");
        models.add("	3G7	");
        models.add("	3G7 512/8G 8312CW	");
        models.add("	3G7 512mb/8g 8312	");
        models.add("	3G7 roundpin	");
        models.add("	3G7x	");
        models.add("	3G7X (512M/8G)	");
        models.add("	3G7X (round-pin) 	");
        models.add("	3G7X 512/8  .3/3mp	");
        models.add("	3G7X 512/8g	");
        models.add("	3G7X 8312cw 512/8G	");
        models.add("	3G7Z	");
        models.add("	3G7Z (round-pin) 	");
        models.add("	3G7z Roundpin	");
        models.add("	4.7inch ORA	");
        models.add("	4.7inch PDA	");
        models.add("	4inch EVDO	");
        models.add("	4G5	");
        models.add("	4G5 (HE)	");
        models.add("	4G5 1G/8G	");
        models.add("	4G5 1G/8G mtk 6735M	");
        models.add("	4G5 512/4G low end	");
        models.add("	4G5 6735 1g/8g	");
        models.add("	4G5 high end, 2/16G	");
        models.add("	4G5 LE	");
        models.add("	4G5 low end 512/4	");
        models.add("	4G5 low end, 1/8G	");
        models.add("	4G5.5 (2G & 16G)	");
        models.add("	4G5.5 mt6735 (2G & 16G)	");
        models.add("	4G6 (1G/8G)	");
        models.add("	4G7	");
        models.add("	4G7	");
        models.add("	4G7 (1G/8G)	");
        models.add("	4G7 (1G/8G)	");
        models.add("	4G7 (7inchLTE	");
        models.add("	4G7 (7inchLTE) 8735 1/8G	");
        models.add("	4G7, 1/8G	");
        models.add("	5.5inch Gyroscope 1g/8G	");
        models.add("	5inch NFC	");
        models.add("	7inch bluetooth keyboard	");
        models.add("	7inch evdo	");
        models.add("	7inch netbook	");
        models.add("	7CZ A33 (round pin) (HE)	");
        models.add("	7CZ A33 (round-pin) (LE)	");
        models.add("	7DC, 6572,512/8G	");
        models.add("	7DC*	");
        models.add("	7dc* 512/8	");
        models.add("	7DC* 512/8g 8312cw 1024*600	");
        models.add("	7DC* 512/8g 8312D	");
        models.add("	7DC* 512/8G, MTL 8312CW	");
        models.add("	7DC* 512/8G, MTL 8312CW	");
        models.add("	7DC*, 8312CA, 512/8G	");
        models.add("	7DC+	");
        models.add("	7DCZ, 1/8G	");
        models.add("	7W	");
        models.add("	7W (HE)	");
        models.add("	Adapter model: DCS05-0501500	");
        models.add("	BIS chargers	");
        models.add("	BSK10	");
        models.add("	BSK23	");
        models.add("	BTD531K	");
        models.add("	charger 500mA (model LSE007)	");
        models.add("	Corning Gorilla Glass	");
        models.add("	digital sound meter	");
        models.add("	DZ09 Smart Watch	");
        models.add("	Feature Phone E1500	");
        models.add("	Feature Phone K207	");
        models.add("	Feature Phone K209	");
        models.add("	forefone	");
        models.add("	forefone	");
        models.add("	forefone	");
        models.add("	forefone (4-SIM)	");
        models.add("	G01	");
        models.add("	G05	");
        models.add("	G06	");
        models.add("	glasses	");
        models.add("	Gorilla Glass	");
        models.add("	H3 Mart Bracelet	");
        models.add("	heat tanker	");
        models.add("	i3G7	");
        models.add("	i3G7	");
        models.add("	MINI Speakers	");
        models.add("	photo printer 3 units with cartridges	");
        models.add("	Tempered Glass (Generic)	");
        models.add("	U8 Smart Watch	");
        models.add("	VOIP	");
        models.add("	VOIP	");
        models.add("	W150 Smart Watch	");
        models.add("	WBS1024	");

        ArrayAdapter<String> modelAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, models);

        // Drop down layout style - list view with radio button
        modelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_model.setAdapter(modelAdapter);



        spinner_supplier.setOnItemSelectedListener(this);

        List<String> supplier = new ArrayList<String>();

        supplier.add("	AAPPAA	");
        supplier.add("	Bainawei	");
        supplier.add("	Basicom	");
        supplier.add("	ConnectMe	");
        supplier.add("	ConnectMe	");
        supplier.add("	Consung	");
        supplier.add("	Create value	");
        supplier.add("	CyberBlue	");
        supplier.add("	Diadem	");
        supplier.add("	Eriwin	");
        supplier.add("	Fanvil	");
        supplier.add("	Huaguan	");
        supplier.add("	Huasen	");
        supplier.add("	Hubei jejegao	");
        supplier.add("	Huguan	");
        supplier.add("	Huima	");
        supplier.add("	IDWELL	");
        supplier.add("	Ingly	");
        supplier.add("	Jinde	");
        supplier.add("	Jinhongye	");
        supplier.add("	Jisike	");
        supplier.add("	JWD	");
        supplier.add("	Kaliho	");
        supplier.add("	Kang Beauty	");
        supplier.add("	Keimoo	");
        supplier.add("	Leagoo	");
        supplier.add("	Luckystar	");
        supplier.add("	Miratek	");
        supplier.add("	moveon	");
        supplier.add("	OBO	");
        supplier.add("	ORA	");
        supplier.add("	OVVI	");
        supplier.add("	Pinssunn	");
        supplier.add("	Sintave	");
        supplier.add("	Strong	");
        supplier.add("	Sunworld	");
        supplier.add("	Thecoo	");
        supplier.add("	Tian Zheng	");
        supplier.add("	TopWorld	");
        supplier.add("	Umedia	");
        supplier.add("	Utop-mobile	");
        supplier.add("	Utop-mobile	");
        supplier.add("	Veidoo	");
        supplier.add("	Weiheng	");
        supplier.add("	Weiheng	");
        supplier.add("	world time	");
        supplier.add("	WorldB2b	");
        supplier.add("	Xinfeiyang	");
        supplier.add("	Zhouda	");

        ArrayAdapter<String> supplieradapte = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, supplier);

        // Drop down layout style - list view with radio button
        supplieradapte.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_supplier.setAdapter(supplieradapte);



        spinner_date.setOnItemSelectedListener(this);

        List<String> date = new ArrayList<String>();

        date.add("	04-Jan-16	");
        date.add("	06-Jan-16	");
        date.add("	08-Jan-16	");
        date.add("	12-Jan-16	");
        date.add("	18-Jan-16	");
        date.add("	19-Jan-16	");
        date.add("	20-Jan-16	");
        date.add("	22-Jan-16	");
        date.add("	25-Jan-16	");
        date.add("	28-Jan-16	");
        date.add("	02-Feb-16	");
        date.add("	08-Feb-16	");
        date.add("	22-Feb-16	");
        date.add("	01-Mar-16	");
        date.add("	29-Feb-16	");
        date.add("	04-Mar-16	");
        date.add("	09-Mar-16	");
        date.add("	21-Mar-16	");
        date.add("	30-Mar-16	");
        date.add("	01-Apr-16	");
        date.add("	04-Apr-16	");
        date.add("	06-Apr-16	");
        date.add("	07-Apr-16	");
        date.add("	08-Apr-16	");
        date.add("	12-Apr-16	");
        date.add("	13-Apr-16	");
        date.add("	15-Apr-16	");
        date.add("	18-Apr-16	");
        date.add("	20-Apr-16	");
        date.add("	25-Apr-16	");
        date.add("	28-Apr-16	");
        date.add("	29-Apr-16	");
        date.add("	02-May-16	");
        date.add("	06-May-16	");
        date.add("	09-May-16	");
        date.add("	10-May-16	");
        date.add("	11-May-16	");
        date.add("	16-May-16	");
        date.add("	18-May-16	");
        date.add("	19-May-16	");
        date.add("	24-May-16	");
        date.add("	25-May-16	");
        date.add("	27-May-16	");
        date.add("	30-May-16	");
        date.add("	31-May-16	");
        date.add("	06-Jun-16	");
        date.add("	16-Jun-16	");
        date.add("	22-Jun-16	");
        date.add("	28-Jun-16	");
        date.add("	01-Jul-16	");
        date.add("	05-Jul-16	");
        date.add("	11-Jul-16	");
        date.add("	13-Jul-16	");
        date.add("	15-Jul-16	");
        date.add("	18-Jul-16	");
        date.add("	25-Jul-16	");
        date.add("	28-Jul-16	");
        date.add("	02-Aug-16	");
        date.add("	01-Aug-16	");
        date.add("	03-Aug-16	");

        ArrayAdapter<String> dateadapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, date);

        // Drop down layout style - list view with radio button
        dateadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_date.setAdapter(dateadapter);



        spinner_unit.setOnItemSelectedListener(this);

        List<Integer> unit = new ArrayList<Integer>();

        unit.add(	1	);
        unit.add(	2	);
        unit.add(	3	);
        unit.add(	4	);
        unit.add(	5	);
        unit.add(	6	);
        unit.add(	7	);
        unit.add(	8	);
        unit.add(	9	);
        unit.add(	10	);
        unit.add(	11	);
        unit.add(	12	);
        unit.add(	13	);
        unit.add(	14	);
        unit.add(	15	);
        unit.add(	16	);
        unit.add(	17	);
        unit.add(	18	);
        unit.add(	19	);
        unit.add(	20	);

        // Creating adapter for spinner
        ArrayAdapter<Integer> unitadapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, unit);

        // Drop down layout style - list view with radio button
        unitadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner_unit.setAdapter(unitadapter);




        Button addbutton = (Button) findViewById(R.id.add_button);
        addbutton.setOnClickListener(this);
        Button removebutton = (Button) findViewById(R.id.remove_button);
        removebutton.setOnClickListener(this);















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
    }

    @Override
    public void onClick(View v) {
        Log.i("clicks", "You Clicked B1");
        Intent i=new Intent(Model.this, MainActivity.class);
        startActivity(i);
    }

    /**
     * <p>Callback method to be invoked when an item in this view has been
     * selected. This callback is invoked only when the newly selected
     * position is different from the previously selected position or if
     * there was no selected item.</p>
     * <p/>
     * Impelmenters can call getItemAtPosition(position) if they need to access the
     * data associated with the selected item.
     *
     * @param parent   The AdapterView where the selection happened
     * @param view     The view within the AdapterView that was clicked
     * @param position The position of the view in the adapter
     * @param id       The row id of the item that is selected
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    /**
     * Callback method to be invoked when the selection disappears from this
     * view. The selection can disappear for instance when touch is activated
     * or when the adapter becomes empty.
     *
     * @param parent The AdapterView that now contains no selected item.
     */
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
