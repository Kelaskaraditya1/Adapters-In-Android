package com.starkindustries.listviewandadapters.Adapters
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.widget.AppCompatTextView
import com.starkindustries.listviewandadapters.R

class CustomBaseAdapter(var context_:Context,var sidList_:ArrayList<String>,nameList_:ArrayList<String>,departmentList_:ArrayList<String>) : BaseAdapter(){
    lateinit var context:Context
    lateinit var sidList:ArrayList<String>
    lateinit var nameList:ArrayList<String>
    lateinit var departmentList: ArrayList<String>
    lateinit var sid:AppCompatTextView
    lateinit var name:AppCompatTextView
    lateinit var department:AppCompatTextView
    init
    {
        this.context=context_
        this.sidList=sidList_
        this.nameList=nameList_
        this.departmentList=departmentList_
    }
    override fun getCount(): Int
    {
        return sidList.size
    }

    override fun getItem(position: Int): Any
    {
     return "I am Ironman"
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        val view  = LayoutInflater.from(context).inflate(R.layout.customrow,parent,false)
        name=view.findViewById(R.id.name)
        sid=view.findViewById(R.id.sid)
        department=view.findViewById(R.id.department)
        name.setText(nameList.get(position))
        sid.setText(sidList.get(position))
        department.setText(departmentList.get(position))
        return view
    }
}