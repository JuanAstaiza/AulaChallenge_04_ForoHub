/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  JuanAstaiza
 * Created: 21 may 2024
 */

create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100),
    mensaje varchar(100),   
    fecha_creacion date,   
    estatus varchar(100),   
    autor varchar(100),   
    curso varchar(100),   
    primary key(id)
);