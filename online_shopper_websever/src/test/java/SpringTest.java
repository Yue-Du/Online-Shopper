import com.yue.shopper.mapper.GoodsInfoMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:base/applicationContext.xml"})
public class SpringTest {

    @Resource
    GoodsInfoMapper goodsInfoMapper;

    @Test
    public void testGoodsInfoMapper(){
        System.out.println(goodsInfoMapper.getGoodsDoByBatch(0,100));

    }

}
