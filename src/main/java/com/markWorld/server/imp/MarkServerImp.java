package com.markWorld.server.imp;

import com.markWorld.MarkWorldException;
import com.markWorld.dto.MarkDTO;
import com.markWorld.entity.Mark;
import com.markWorld.entity.MarkWorldExceptionEnum;
import com.markWorld.server.MarkServer;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.io.WKTWriter;

public class MarkServerImp implements MarkServer {
    @Aoutwired
    GeometryFactory geometryFactory;

    @Aoutwired
    WKTWriter wktWriter;
    @Override
    public void addMark(MarkDTO markDTO) throws MarkWorldException {
        Coordinate coordinate = new Coordinate(markDTO.getLongitude(), markDTO.getLatitude());
        Point point = geometryFactory.createPoint(coordinate);
        Mark mark = new Mark();
        mark.setPoint(point);

        String markContent = wktWriter.write(mark.getPoint());


        throw new MarkWorldException(MarkWorldExceptionEnum.ADD_FAIL);
    }
}
