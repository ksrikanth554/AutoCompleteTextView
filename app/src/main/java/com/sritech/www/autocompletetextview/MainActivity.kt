package com.sritech.www.autocompletetextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Xml Array*/

        //var values = resources.getStringArray(R.array.countries)

        /*Kotlin Array*/

        var values=arrayOf("Austalia","America","iran","india")

        /*User xml for View*/
        var myAdapter = ArrayAdapter(this, R.layout.indcountries, values)
      /*System xml for view*/
        //    var myAdapter=ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,values)
        actv.setAdapter(myAdapter)
        actv.threshold=1
    }
}