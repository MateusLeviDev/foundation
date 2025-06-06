O que é um IP Address? Basicamente o ID do host. Designed em 32 bits (4 bytres), representado por four octets de (0-255). 2³²
O que é um host, portanto? Any device wich sends or receive traffic (over a network). any IoT devide (geladeira, smart watches, speakers...)
O que é uma network? Logical grouping of hosts (similar connectivity). a network is what transport traffic between hosts. 
Uma network pode conter outra network? Sim, esse é o conceito de subnetting. parte de uma big network. mais segurança no isolamento
Routers: facilitate communication between networks
Switches: facilitate communication within a network
Ou seja, switch conecta dispositivos dentro de uma mesma LAN e o router conecta seu PC ao servidor do google, por exmeplo. 
O que é um servidor? um computador ou sistema computacional dedicado. um servidor basicamente consiste em um serviço para responder as 
   solicitações de clientes e prover os recursos necessários para a execução de suas operações.

- internet nothing more than a bunch of diff routers
- create the hierarchy in networks and the entire internet


How packets move through the internet?

Imagine a scenario where two hosts are communicating over a network. On one side, a host runs an application that generates data which needs to be sent to the other host. 
To prepare this data for transmission, a process known as encapsulation begins. First, the data reaches the transport layer (Layer 4), which wraps it with a TCP header. 
This header contains important information such as the source and destination ports, which allow the communication to occur between specific services on each host. 
Once this header is added, the unit is now called a segment. Next, the segment is passed down to the network layer (Layer 3). 
Here, another header is added, containing the source and destination IP addresses. This header ensures that the data can be delivered from the originating host to the destination host across potentially multiple networks. 
At this point, the segment becomes a packet. The data link layer (Layer 2) then takes over, encapsulating the packet within a frame. 
It adds the MAC addresses of both the source and the next hop (which could be the final destination or an intermediate router). These MAC addresses are essential for hop-to-hop delivery within a local network segment.
Finally, at the physical layer (Layer 1), the entire frame is converted into a stream of bits—electrical signals, light pulses, or radio waves—that are transmitted over the physical medium, such as an Ethernet cable or a Wi-Fi connection.
Once the frame reaches the other host, the process is reversed through decapsulation. The bits are interpreted and reassembled into a frame, from which the packet is extracted. 
The network layer then retrieves the segment, and finally, the transport layer delivers the original application data to the appropriate service.




---



packet -> header IP (src IP, dst IP, Protocol (TCP, UDP, ICMP etc.)) + payload (application data)
NIC (Network Interface Card) -> physical hardware component. Wi-Fi module, Ethernet card. it’s what sends and receives the electrical or radio signals. LAYER 1 [The MAC address is a unique identifier burned into the firmware of the NIC.  é associado à interface de rede]
Network Interface -> logical representation of a NIC in OS         [The network interface represents the NIC in the OS.]                 ambos es~tao na LAYER 2



NIC	Layer 1 & 2	Converts bits to signals (Layer 1) and handles MAC addressing + Ethernet frames (Layer 2)
Network Interface	Layer 2 (mostly)	Logical representation in the OS for sending/receiving Layer 2 frames using the NIC
    When you send data over Wi-Fi:
        Your network interface adds a MAC address to the frame (Layer 2).
        The NIC takes that frame and transmits it as radio signals (Layer 1).


TCP (Transmission Control Protocol) e UDP (User Datagram Protocol) são protocolos da Camada 4 (Transporte) do modelo OSI e TCP/I.
     Navegação web (HTTP/HTTPS)
     E-mail (SMTP, IMAP, POP3)
     Transferência de arquivos (FTP)

MAC addresses work only within a local network segment (LAN). 

When crossing networks, Layer 3 IP routing decides the path.

Every hop (router-to-router or router-to-host) uses new Layer 2 frames with relevant MAC addresses.


---



![Screenshot from 2025-06-06 11-31-49](https://github.com/user-attachments/assets/15c1326d-f22f-472b-84f8-c98ebaa86773)





