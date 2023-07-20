class OneStepAhead

  def initialize
    @directions = [:north, :east, :south, :west]
    @position = 0
  end

  def move
    @position += 1
    @position = 0 if @position == @directions.size
  end

  def turn_right
    move
  end

  def turn_left
    @position -= 1
    @position = @directions.size - 1 if @position < 0
  end

  def current_direction
    @directions[@position]
  end

  def move_forward
  	case current_direction
    when :north then move_north
    when :east then move_east
    when :south then move_south
    when :west then move_west
  	end
  end

  def move_north
  	# Move north
  end

  def move_east
  	# Move east
  end

  def move_south
  	# Move south
  end

  def move_west
  	# Move west
  end

end