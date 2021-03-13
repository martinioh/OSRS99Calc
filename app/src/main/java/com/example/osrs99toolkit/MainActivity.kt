package com.example.osrs99toolkit

import AttackImp
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.kittinunf.fuel.Fuel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtTitle.text = "OSRS 99 Calculator"

        val stats = listOf("Total", "Attack", "Defence","Strength","Hitpoints","Ranged","Prayer","Magic","Cooking","Woodcutting","Fletching","Fishing","Firemaking","Crafting","Smithing","Mining","Herblore","Agility","Thieving","Slayer","Farming","Runecraft","Hunter","Construction")

        var URL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player="



        btnSubmit.setOnClickListener(){
            var txtusernameInput = txtUsername.text.toString()
            if (txtusernameInput != ""){
                URL += txtusernameInput
                getStats(URL)

            }
        }

    }

    fun getStats(URL: String){
        Fuel.get(URL).response { request, response, result ->
            val (bytes, error) = result
            if (bytes != null) {
                val myBody = String(response.data)
                val statlist = mutableListOf(*myBody.split("\n").toTypedArray())
                initialiseFields(statlist)
            } else {
                Toast.makeText(this,"Error retrieving data from Hiscores. Please try again later.",Toast.LENGTH_LONG).show()
            }
        }
    }

    fun initialiseFields(statList: List<String>){
        for (a in statList){
          


        }
    }


}

