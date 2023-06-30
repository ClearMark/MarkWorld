package com.markWorld.server;

import com.markWorld.MarkWorldException;
import org.springframework.stereotype.Service;

@Service
public interface MarkServer {

    void addMark(String markName, String markContent) throws MarkWorldException;
}
