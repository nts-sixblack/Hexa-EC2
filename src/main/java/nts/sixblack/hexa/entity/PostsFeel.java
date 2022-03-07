package nts.sixblack.hexa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "postsFeel")
public class PostsFeel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postsFeelId;
    private boolean feel;

    @ManyToOne
    @JoinColumn(name = "postsId")
    Posts posts;

    @ManyToOne
    @JoinColumn(name = "userId")
    User user;
}