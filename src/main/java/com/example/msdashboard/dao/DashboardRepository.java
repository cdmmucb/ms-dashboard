package com.example.msdashboard.dao;

import com.example.msdashboard.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DashboardRepository extends JpaRepository<Order, Long> {

    //prendas sin stock
    @Query(value="select count(*) from product where units_in_stock = 0",nativeQuery = true)
    public Integer getPrendasSinStock();

    //prendas con stock
    @Query(value="select count(*) from product where units_in_stock > 0",nativeQuery = true)
    public Integer getPrendasConStock();

    //prendas por categoria
    @Query(value="    select b.category_name, count(*) from product as a join product_category as b\n" +
            "    where a.category_id = b.id\n" +
            "    group by b.id ",nativeQuery = true)
    public List<Integer> getPrendasPorCategoria();

    //ordenes por mes
    @Query(value="select count(*) from orders GROUP BY YEAR(date_created), MONTH(date_created)",nativeQuery = true)
    public Integer getOrdenesMes();

    //prendas vendidas por mes
    @Query(value="select sum(total_quantity) from orders GROUP BY YEAR(date_created), MONTH(date_created)",nativeQuery = true)
    public Integer getPrendasMes();

    //monto de ventas por mes
    @Query(value="select sum(total_price) from orders GROUP BY YEAR(date_created), MONTH(date_created)",nativeQuery = true)
    public Float getMontoMes();

    //cantidad de ventas por cada prenda (ordenado)
    @Query(value="select sum(quantity) from order_item group by (product_id) order by sum(quantity)",nativeQuery = true)
    public Integer getCantidadPrendasMes();
}
