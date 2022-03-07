package nts.sixblack.hexa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostsFeelInfo {
    private long postsFeelId;
    private boolean feel;
    private long postsId;
}