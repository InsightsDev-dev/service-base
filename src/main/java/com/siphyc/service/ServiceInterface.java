package com.siphyc.service;

import java.util.Map;
import javax.ws.rs.core.Response;

/**
 *
 * @author korena
 */
public interface ServiceInterface {

    public Response getPhones(int limit);

    public Response getPhone(int id);

    public Response addPhone(Map<String, Object> map);

    public Response editPhone(Map<String, Object> map);
    
    public Response addOrEdit(Map<String,Object> map);

    public Response deletePhone(String id);
}