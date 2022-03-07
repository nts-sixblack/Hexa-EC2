package nts.sixblack.hexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "channel")
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long channelId;
    @Column(columnDefinition = "ntext")
    private String name;
    @Column(columnDefinition = "ntext")
    private String decription;

    @OneToMany(mappedBy = "channel")
    List<UserChannel> userChannelList;

    @OneToMany(mappedBy = "channel")
    List<Message> messageList;

    @OneToOne(mappedBy = "channel")
    Contact contact;
}