package com.example.webgiay.service;

import com.example.webgiay.dto.*;
import com.example.webgiay.entity.Oder;
import com.example.webgiay.entity.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OderService {

    OderDTO create(User user, Oder oder, List<CartDetailDTO> cartDetailDTOS, OderDTO oderDTO);

    List<DonHangDTO> choThanhToan(User user);

    List<DonHangDTO> vanChuyen(User user);

    List<DonHangDTO> dangGiao(User user);

    List<DonHangDTO> hoanThanh(User user);

    List<DonHangDTO> daHuy(User user);

    List<QLDonHangDTO> quanLyDonHang();

    CustomerOderDTO customerOder(@Param("id") Integer id);

    List<CustomerProductDTO> productOfCustomer(@Param("id") Integer id);

    Oder updateStatus(Oder oder,Integer id);
}