<?php
/**
 * The template for displaying the footer
 *
 * Contains footer content and the closing of the #main and #page div elements.
 *
 *
 * @package Ridizain
 * @since Ridizain 1.0
 */
?>

		</div><!-- #main -->
</div><!-- #page -->
		<footer id="colophon" class="site-footer" role="contentinfo">

			<?php get_sidebar( 'footer' ); ?>

			<div class="site-info">
				<?php do_action( 'ridizain_credits' ); ?>
				<a href="<?php echo esc_url( __( 'http://wordpress.org/', 'ridizain' ) ); ?>"><?php printf( __( 'Proudly powered by %s', 'ridizain' ), 'WordPress' ); ?></a>
				<span class="sep"> || </span>
				<a href="<?php echo esc_url( __( 'http://www.wpstrapcode.com/', 'ridizain' ) ); ?>"><?php printf( __( 'Themed by %s', 'ridizain' ), 'WP Strap Code' ); ?></a>
			</div><!-- .site-info -->
		</footer><!-- #colophon -->
	<?php wp_footer(); ?>
</body>
</html>