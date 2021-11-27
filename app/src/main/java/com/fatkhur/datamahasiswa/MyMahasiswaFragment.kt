package com.fatkhur.datamahasiswa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fatkhur.datamahasiswa.R.layout.fragment_my_mahasiswa
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_mahasiswa.*

class MyMahasiswaFragment : Fragment() {
    lateinit var listMahasiswa:ArrayList<MyMahasiswa>

    private fun simulasiDataMahasiswa() {
        listMahasiswa= ArrayList()
        listMahasiswa.add(
            MyMahasiswa("Fatkhur Rokhman","arrokhman7@gmail.com",
            "085786644169","Laki-laki","Pasuruan")
        )
        listMahasiswa.add(MyMahasiswa("Fatkhur Ramadhani","arrokhman6@gmail.com",
            "085786644169","Laki-laki","Pasuruan")
        )
        listMahasiswa.add(MyMahasiswa("uswatun khasanah","uswah6835@gmail.com",
            "083160261658","perempuan","Lampung")
        )
        listMahasiswa.add(MyMahasiswa("Naylatul Millah","arrokhman8@gmail.com",
            "082273607635","Perempuan","Mojokerto")
        )
        listMahasiswa.add(MyMahasiswa("Fungki Oktaviyati","arrokman185@gmail.com",
            "088803832936","Perempuan","sidoarjo")
        )
    }

    private fun tampilMahasiswa() {
        rv_listMyMahasiswa.layoutManager=LinearLayoutManager(activity)
        rv_listMyMahasiswa.adapter=MyMahasiswaAdapter(activity,listMahasiswa)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_mahasiswa, container,false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataMahasiswa()
        tampilMahasiswa()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}