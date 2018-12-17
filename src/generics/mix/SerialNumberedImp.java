/**
 * Project: MyTest
 * <p>
 * File Created at 2018/12/17
 * <p>
 * Copyright 2018 e-dewin.com Corporation Limited.
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of
 * dewin Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with e-dewin.com.
 */
package generics.mix;

/**
 * @Description:
 * @author: hxw
 * @version 1.0
 * @date: 2018/12/17 12:32
 */
class SerialNumberedImp implements SerialNumbered {
    private static long counter = 1;
    private final long serialNumber = counter++;
    public long getSerialNumber() {
        return serialNumber;
    }
}
