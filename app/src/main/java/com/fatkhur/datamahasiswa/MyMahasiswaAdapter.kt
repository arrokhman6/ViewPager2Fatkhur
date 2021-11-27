package com.fatkhur.datamahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_mahasiswa_item.*

class MyMahasiswaAdapter(private val context: FragmentActivity?, private val items: ArrayList<MyMahasiswa>):
    RecyclerView.Adapter<MyMahasiswaAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.my_mahasiswa_item, parent, false)
    )

    override fun getItemCount(): Int {
    return items.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.bindItem(items.get(position))
    }
    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView),LayoutContainer {
                fun bindItem(item: MyMahasiswa) {
                    txtMahasiswaName.text=item.name
                    txtMahasiswaEmail.text=item.email
                    txtMahasiswaTelp.text=item.telp
                    txtMahasiswaJkel.text=item.jkel
                    txtMahasiswaAlamat.text=item.alamat
                }
            }
    }
