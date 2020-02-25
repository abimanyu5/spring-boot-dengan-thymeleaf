package com.project.spring.services;

import java.util.List;

import com.project.spring.model.Mahasiswa;

public interface MahasiswaService {

    List<Mahasiswa> listMahasiswa();

    Mahasiswa saveOrUpdate(Mahasiswa mahasiswa);
    Mahasiswa getIdMahasiswa(Integer id);
    void hapus(Integer id);
    
}