package com.markWorld.server.imp;

import com.markWorld.MarkWorldException;
import com.markWorld.entity.MarkWorldExceptionEnum;
import com.markWorld.server.MarkServer;

public class MarkServerImp implements MarkServer {
    @Override
    public void addMark(String markName, String markContent) throws MarkWorldException {
        throw new MarkWorldException(MarkWorldExceptionEnum.ADD_FAIL);
    }
}
