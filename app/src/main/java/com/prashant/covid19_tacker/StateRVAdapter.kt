package com.prashant.covid19_tacker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StateRVAdapter (private val stateList:List<StateModel>) : RecyclerView.Adapter<StateRVAdapter.StateRVViewHolder>() {

    class StateRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val stateNameTV: TextView = itemView.findViewById(R.id.idTVStates)
        val casesTV: TextView = itemView.findViewById(R.id.idTVCases)
        val deathsTV: TextView = itemView.findViewById(R.id.idTVDeaths)
        val recoveredTV: TextView = itemView.findViewById(R.id.idTVRecovered)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRVViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.state_rv_items, parent, false)
        return StateRVViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StateRVViewHolder, position: Int) {
        val stateData = stateList[position]
        holder.stateNameTV.text = stateData.state
        holder.casesTV.text = stateData.cases.toString()
        holder.deathsTV.text = stateData.death.toString()
        holder.recoveredTV.text = stateData.recovered.toString()
    }

    override fun getItemCount(): Int {
        return stateList.size
    }



}