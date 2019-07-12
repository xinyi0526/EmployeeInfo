package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmployee;
    ArrayList<AndroidVersion> employeeList;
    CustomAdaptor adaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmployee = findViewById(R.id.employeeList);

        employeeList = new ArrayList<>();
        employeeList.add(new AndroidVersion("John","Software Technical Leader","3400.0"));
        employeeList.add(new AndroidVersion("May","Programmer","2200.0"));

        adaptor = new CustomAdaptor(this,R.layout.row,employeeList);

        lvEmployee.setAdapter(adaptor);



    }
}


