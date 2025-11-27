package com.ecommerce.marketstream.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    @NotBlank(message = "nama tidak boleh kosong")
    @Size(min = 2, max = 100, message = "karakter harus diantara 2 dan 100")
    String name;

    @NotNull(message = "harga tidak boleh kosong")
    @Positive(message = "harga tidak boleh negatif")
    @Digits(integer = 10, fraction = 2, message = "maksimal 10 digit dan 2 angka dibelakang koma")
    BigDecimal price;

    @NotNull(message = "deskripsi tidak boleh null")
    @Size(max = 1000, message = "maksimal 1000 karakter")
    String description;
}
