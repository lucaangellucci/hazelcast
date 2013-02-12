/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.spi;

import com.hazelcast.nio.Address;
import com.hazelcast.nio.ConnectionListener;

import java.util.Map;

public interface ConnectionManager {

    Connection getConnection(Address address);

    Connection getOrConnect(Address address);

    Connection getOrConnect(Address address, boolean silent);

    void shutdown();

    void start();

    void addConnectionListener(ConnectionListener connectionListener);

    Map<Address, Connection> getReadonlyConnectionMap();

    void destroyConnection(Connection conn);

    void restart();

    int getCurrentClientConnections();

    int getAllTextConnections();

    boolean bind(Connection connection, Address localAddress, Address targetAddress, boolean replyBack);

}
