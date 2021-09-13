package com.example.testapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import kotlinx.android.synthetic.main.satallites_list_recyclerview_row.view.*
import com.example.testapp.model.SatallitesList
import com.example.testapp.view.SatalliteListFragmentDirections


class SatallitesListAdapter(val satallitestList: ArrayList<SatallitesList>) :
    RecyclerView.Adapter<SatallitesListAdapter.SatallitesListHolder>() {
    class SatallitesListHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SatallitesListHolder {

        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.fragment_satallite_list, parent, false)
        return SatallitesListHolder(itemView)
    }

    override fun onBindViewHolder(holder: SatallitesListHolder, position: Int) {

        holder.itemView.satallitesName.text = satallitestList.get(position).name
        holder.itemView.durum.text = satallitestList.get(position).active.toString()


        holder.itemView.setOnClickListener {


            val action =
                SatalliteListFragmentDirections.actionSatalliteListFragmentToSatallitesDetailFragment()
            Navigation.findNavController(it).navigate(action)


        }


    }

    override fun getItemCount(): Int {
        return satallitestList.size

    }

    fun updateSatallitesList(newSatallitestList: List<SatallitesList>) {

        satallitestList.clear()
        satallitestList.addAll(newSatallitestList)
        notifyDataSetChanged()


    }

}