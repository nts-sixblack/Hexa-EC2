package nts.sixblack.hexa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostsInfo {
    private long postsId;
    private String caption;
    private List<PostsUserInfo> postsUserList;
    private List<PostsCommentInfo> postsCommentList;
    private List<PostsFeelInfo> postsFeelList;
    private List<PostsImageInfo> postsImageList;
}