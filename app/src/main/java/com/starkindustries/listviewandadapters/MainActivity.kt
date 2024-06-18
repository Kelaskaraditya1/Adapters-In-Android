package com.starkindustries.listviewandadapters
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatSpinner
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.starkindustries.listviewandadapters.Adapters.CustomArrayAdapter
import com.starkindustries.listviewandadapters.Adapters.CustomBaseAdapter
import com.starkindustries.listviewandadapters.Model.User
import com.starkindustries.listviewandadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var nameslist:ArrayList<String>
    lateinit var departmentList:ArrayList<String>
    lateinit var arrayadapter:ArrayAdapter<String>
    lateinit var departmentSdapter:ArrayAdapter<String>
    lateinit var sidlist:ArrayList<String>
    lateinit var userList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        nameslist= ArrayList<String>()
        nameslist.add("Aditya")
        nameslist.add("Sanjana")
        nameslist.add("Sandeep")
        nameslist.add("Nidish")
        nameslist.add("Deepak")
        nameslist.add("Sonali")
        nameslist.add("Minakshi")
        nameslist.add("Shantaram")
        nameslist.add("Pramila")
        nameslist.add("Abhijeet")
        departmentList= ArrayList<String>()
        departmentList.add("Computer")
        departmentList.add("Information & Technology")
        departmentList.add("AIDS")
        departmentList.add("Civil")
        departmentList.add("Mechanical")
        departmentList.add("Chemical")
        departmentList.add("Civil and Infra")
        departmentList.add("Humanities")
        departmentList.add("Electrical")
        departmentList.add("E&TC")
        sidlist= ArrayList<String>()
        sidlist.add("2021FHCO054")
        sidlist.add("2021FHCO01")
        sidlist.add("2021FHCO02")
        sidlist.add("2021FHCO03")
        sidlist.add("2021FHCO04")
        sidlist.add("2021FHCO05")
        sidlist.add("2021FHCO06")
        sidlist.add("2021FHCO07")
        sidlist.add("2021FHCO08")
        sidlist.add("2021FHCO09")
        userList=ArrayList<User>()
        userList.add(User("2021FHCO042","Aditya","computer"))
        userList.add(User("2021FHCO054","Mayur","Computer"))
        userList.add(User("2021FHCO064","Prathamesh","Computer"))
        userList.add(User("2021FHCO58","Dhanashree","Civil"))
        userList.add(User("2021FHCO068","Shrikant","Computer"))
//        arrayadapter= ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,nameslist)
//        binding.listview.setAdapter(arrayadapter)
//        binding.listview.setOnItemClickListener(object :OnItemClickListener
//        {
//            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
//            {
//               Toast.makeText(applicationContext,"The name is:"+nameslist.get(position),Toast.LENGTH_SHORT).show()
//            }
//        }
//        )
        binding.listview.adapter=CustomArrayAdapter(applicationContext,userList)
        departmentSdapter= ArrayAdapter(applicationContext,android.R.layout.simple_dropdown_item_1line,departmentList)
        binding.departmentSpinner.adapter=departmentSdapter
        binding.departmentSpinner.onItemSelectedListener = object:OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
            {
                Toast.makeText(applicationContext,"The department is:"+departmentList.get(position),Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?)
            {

            }

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}