/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.napas.ach.testjackson;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.napas.ach.testjackson.model.Ban;
import com.napas.ach.testjackson.model.ChucNang;
import com.napas.ach.testjackson.model.CongTy;
import com.napas.ach.testjackson.model.Item;
import com.napas.ach.testjackson.model.Itemtype;
import com.napas.ach.testjackson.model.NapasDocument;
import com.napas.ach.testjackson.model.NapasDocumentHeader;
import com.napas.ach.testjackson.model.NapasDocumentPayload;
import com.napas.ach.testjackson.model.ObjectFactory;
import com.napas.ach.testjackson.model.Phong;
import com.napas.ach.testjackson.model.Shiporder;
import com.napas.ach.testjackson.model.Shipordertype;
import com.napas.ach.testjackson.model.Shipto;
import com.napas.ach.testjackson.model.Shiptotype;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

/**
 *
 * @author HuyNX
 */
public class Main {

    public static void sample1() {
//        ObjectFactory of = new ObjectFactory();
//        CongTy congTy = of.createCongTy();
//        congTy.setName("NAPAS");
//        congTy.setDirector("Nguyen Quang Hung");
//
//        CongTy.DsPhong dsPhong = of.createCongTyDsPhong();
//        congTy.setDsPhong(dsPhong);
//
//        List<Phong> listPhongs = dsPhong.getItem();
//        listPhongs.add(new Phong("ACH", "NinhHN"));
//        listPhongs.add(new Phong("QTHT", "Bao Khanh"));
//
//        List<Ban> listBan = congTy.getBan();
//        listBan.add(new Ban("Tai chinh"));
//
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        mapper.setSerializationInclusion(Include.NON_NULL);
//
//        JaxbAnnotationModule module = new JaxbAnnotationModule();
//        mapper.registerModule(module);
//
//        String output = mapper.writeValueAsString(congTy);
//        System.out.println(output);
//
//        JAXBContext jaxbContext = JAXBContext.newInstance(CongTy.class);
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        StringWriter sw = new StringWriter();
//        jaxbMarshaller.marshal(congTy, sw);
//        output = sw.toString();
//
//        System.out.println(output);
    }
    
//    public static void sample2() throws JAXBException, JsonProcessingException {
//        ObjectFactory of = new ObjectFactory();
//        Shipordertype order = of.createShipordertype();
//        JAXBElement<Shipordertype> doc = of.createShiporder(order);
//        
//        Shiptotype to = of.createShiptotype();
//        to.setAddress("136 HTM");
//        to.setCity("Ha Noi");
//        to.setCountry("Viet nam");
//        to.setName("HuyNX");
//        
//        order.setShipto(to);
//        List<Itemtype> listItems = order.getItem();
//        
//        Itemtype item = of.createItemtype();
//        item.setPrice(BigDecimal.valueOf(10000));
//        item.setQuantity(BigInteger.valueOf(1));
//        item.setTitle("Bia");
//        item.setNote("Gio hanh chinh");
//        listItems.add(item);
//        
//        item = of.createItemtype();
//        item.setPrice(BigDecimal.valueOf(20000));
//        item.setQuantity(BigInteger.valueOf(2));
//        item.setTitle("Coca Cola");
//        item.setNote("Gio hanh chinh");
//        listItems.add(item);
//        
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        mapper.setSerializationInclusion(Include.NON_NULL);
//
//        JaxbAnnotationModule module = new JaxbAnnotationModule();
//        mapper.registerModule(module);
//
//        String output = mapper.writeValueAsString(order);
//        System.out.println(output);
//
//        JAXBContext jaxbContext = JAXBContext.newInstance(Shipordertype.class);
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        StringWriter sw = new StringWriter();
//        jaxbMarshaller.marshal(doc, sw);
//        output = sw.toString();
//
//        System.out.println(output);
//        
//    }
     
    public static void sample3() throws JsonProcessingException, JAXBException {
        ObjectFactory of = new ObjectFactory();
        NapasDocument doc = of.createNapasDocument();
        
        NapasDocumentHeader docHeader = of.createNapasDocumentHeader();
        doc.setHeader(docHeader);
        
        docHeader.setMessageIdentifier("pacs008");
        docHeader.setSenderReference("123456");
        
        NapasDocumentPayload docPayload = of.createNapasDocumentPayload();
        doc.setPayload(docPayload);   
        
        Phong phong = of.createPhong();
        docPayload.setAppHdr(phong);
        
        phong.setName("ACH");
        phong.setLeader("NinhHN");
        
        ChucNang chucNang = of.createChucNang();
        chucNang.setName("Thanh toan");
        chucNang.setDesc("Phu trach chuyen tien");
        
        docPayload.setAny(chucNang);
        
        JAXBElement<NapasDocument> docJson = of.createNapasDocument(doc);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.setSerializationInclusion(Include.NON_NULL);

        JaxbAnnotationModule module = new JaxbAnnotationModule();
        mapper.registerModule(module);

        String output = mapper.writeValueAsString(docJson.getValue());
        System.out.println(output);

        JAXBContext jaxbContext = JAXBContext.newInstance(NapasDocument.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbMarshaller.marshal(docJson, sw);
        output = sw.toString();

        System.out.println(output);
    }
    
    
    public static void main(String[] args) throws JsonProcessingException, PropertyException, JAXBException {
        sample3();
    }
}
