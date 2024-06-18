package com.starkindustries.listviewandadapters.Adapters
import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.provider.UserDictionary.Words
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.widget.AppCompatTextView
import com.starkindustries.listviewandadapters.Model.User
import com.starkindustries.listviewandadapters.R

class CustomArrayAdapter(var context_:Context,var userList_:ArrayList<User>) :
    ArrayAdapter<User>(context_,0,userList_)
{

        lateinit var userList: ArrayList<User>
    lateinit var sid: AppCompatTextView
    lateinit var name: AppCompatTextView
    lateinit var department: AppCompatTextView
        init{
            var context=context_
            this.userList=userList_
        }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        var view = LayoutInflater.from(context).inflate(R.layout.customrow,parent,false)
        name=view.findViewById(R.id.name)
        sid=view.findViewById(R.id.sid)
        department=view.findViewById(R.id.department)
        name.setText(userList.get(position).name)
        sid.setText(userList.get(position).sid)
        department.setText(userList.get(position).department)
        return view
    }
}