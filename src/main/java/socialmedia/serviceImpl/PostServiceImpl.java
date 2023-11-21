package socialmedia.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import socialmedia.model.Post;
import socialmedia.repository.PostRepository;
import socialmedia.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createNewPost(Post post, Integer userId) throws Exception {
        return null;
    }

    @Override
    public String deletePost(Integer postId, Integer userId) {
        return null;
    }

    @Override
    public List<Post> findPostByUserId(Integer userId) {
        return null;
    }

    @Override
    public Post findPostById(Integer postId) {
        return null;
    }

    @Override
    public List<Post> findAllPost() {
        return null;
    }

    @Override
    public Post savedPost(Integer postId, Integer userId) {
        return null;
    }

    @Override
    public Post likePost(Integer postId, Integer userId) {
        return null;
    }
}
