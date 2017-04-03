/**
 * ====================================================================
 *            Big Data Vista Baby
 *
 * is a new Open Source IoT Broker and HAL Server for Iot Devices.
 *
 * Copyright (C) 2016-2017 Taha BEN SALAH
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * ====================================================================
 */
package net.vpc.app.bdvbbroker.devices.teltonika.fm3200.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vpc on 10/30/16.
 */
public class FMIO {
    public int eventIOID ;
    public int allCount ;
//    public int oneByteCount ;
    public List<FMIOValue> oneByteValues = new ArrayList<FMIOValue>();
//    public int twoByteCount;
    public List<FMIOValue> twoByteValues = new ArrayList<FMIOValue>();
//    public int fourByteCount;
    public List<FMIOValue> fourByteValues = new ArrayList<FMIOValue>();
//    public int eightByteCount ;
    public List<FMIOValue> eightByteValues = new ArrayList<FMIOValue>();

    public  String toString()
    {
        return "FMIO{" + "eventIOID=" + eventIOID + ", allCount=" + allCount + ", oneByteValues=" + oneByteValues.toString() +  ", twoByteValues=" + twoByteValues.toString() + ", fourByteValues=" + fourByteValues.toString() + ", eightByteValues=" + eightByteValues.toString() + '}';
    }

}
