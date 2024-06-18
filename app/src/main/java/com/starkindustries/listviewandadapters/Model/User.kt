package com.starkindustries.listviewandadapters.Model

open class User(var sid_:String,var name_:String,var department_:String)
{
    lateinit var sid:String
    lateinit var name:String
    lateinit var department:String
    init{
        this.name=name_
        this.department=department_
        this.sid=sid_
    }
}