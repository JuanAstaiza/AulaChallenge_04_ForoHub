/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  JuanAstaiza
 * Created: 21 may 2024
 */

create table usuarios(
    id bigint not null auto_increment,
    username varchar(100) not null unique,
    clave varchar(300) not null,   
    primary key(id)
);